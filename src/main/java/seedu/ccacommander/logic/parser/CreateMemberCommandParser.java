package seedu.ccacommander.logic.parser;

import static seedu.ccacommander.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.ccacommander.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.ccacommander.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.ccacommander.logic.parser.CliSyntax.PREFIX_GENDER;
import static seedu.ccacommander.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.ccacommander.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.ccacommander.logic.parser.CliSyntax.PREFIX_TAG;

import java.util.Set;
import java.util.stream.Stream;

import seedu.ccacommander.logic.commands.CreateMemberCommand;
import seedu.ccacommander.logic.parser.exceptions.ParseException;
import seedu.ccacommander.model.member.Address;
import seedu.ccacommander.model.member.Email;
import seedu.ccacommander.model.member.Gender;
import seedu.ccacommander.model.member.Member;
import seedu.ccacommander.model.member.Phone;
import seedu.ccacommander.model.shared.Name;
import seedu.ccacommander.model.tag.Tag;

/**
 * Parses input arguments and creates a new CreateMemberCommand object
 */
public class CreateMemberCommandParser implements Parser<CreateMemberCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the CreateMemberCommand
     * and returns an CreateMemberCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public CreateMemberCommand parse(String args) throws ParseException {
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_NAME, PREFIX_GENDER,
                        PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS, PREFIX_TAG);

        if (!arePrefixesPresent(argMultimap, PREFIX_NAME, PREFIX_ADDRESS, PREFIX_PHONE, PREFIX_EMAIL)
                || !argMultimap.getPreamble().isEmpty()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, CreateMemberCommand.MESSAGE_USAGE));
        }

        argMultimap.verifyNoDuplicatePrefixesFor(PREFIX_NAME, PREFIX_GENDER,
                PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS);
        Name name = ParserUtil.parseName(argMultimap.getValue(PREFIX_NAME).get());
        Gender gender = getParsedGender(argMultimap);
        Phone phone = ParserUtil.parsePhone(argMultimap.getValue(PREFIX_PHONE).get());
        Email email = ParserUtil.parseEmail(argMultimap.getValue(PREFIX_EMAIL).get());
        Address address = ParserUtil.parseAddress(argMultimap.getValue(PREFIX_ADDRESS).get());
        Set<Tag> tagList = ParserUtil.parseTags(argMultimap.getAllValues(PREFIX_TAG));

        Member member = new Member(name, gender, phone, email, address, tagList);

        return new CreateMemberCommand(member);
    }

    public Gender getParsedGender(ArgumentMultimap argMultimap) throws ParseException {
        if (argMultimap.getValue(PREFIX_GENDER).isPresent()) {
            return ParserUtil.parseGender(argMultimap.getValue(PREFIX_GENDER).get());
        } else {
            return Gender.EMPTY_GENDER;
        }
    }

    /**
     * Returns true if none of the prefixes contains empty {@code Optional} values in the given
     * {@code ArgumentMultimap}.
     */
    private static boolean arePrefixesPresent(ArgumentMultimap argumentMultimap, Prefix... prefixes) {
        return Stream.of(prefixes).allMatch(prefix -> argumentMultimap.getValue(prefix).isPresent());
    }

}
