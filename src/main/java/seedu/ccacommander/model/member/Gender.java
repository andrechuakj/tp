package seedu.ccacommander.model.member;

import static java.util.Objects.requireNonNull;
import static seedu.ccacommander.commons.util.AppUtil.checkArgument;
import static seedu.ccacommander.commons.util.StringUtil.capitaliseWordsInString;

/**
 * Represents a Member's gender in CcaCommander.
 * Guarantees: immutable; is valid as declared in {@link #isValidGender(String)}
 */
public class Gender {

    public static final String MESSAGE_CONSTRAINTS = "Gender should only be one of the following: \n"
            + "Male, Female, or Others";
    public static final Gender EMPTY_GENDER = new Gender();

    public final String value;

    /**
     * Constructs a {@code Gender}.
     * Trims any leading and trailing whitespaces of the gender param.
     *
     * @param gender A valid gender.
     */
    public Gender(String gender) {
        requireNonNull(gender);
        checkArgument(isValidGender(gender), MESSAGE_CONSTRAINTS);
        value = gender.trim().toLowerCase();
    }

    /**
     * Constructs an empty {@code Gender}.
     */
    private Gender() {
        value = "";
    }

    /**
     * Returns True if a given string is a valid gender.
     */
    public static boolean isValidGender(String userInputGender) {
        return userInputGender.trim().toLowerCase().equals("male")
                || userInputGender.trim().toLowerCase().equals("female")
                || userInputGender.trim().toLowerCase().equals("others");
    }

    @Override
    public String toString() {
        return capitaliseWordsInString(value);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Gender)) {
            return false;
        }

        Gender otherGender = (Gender) other;
        return value.equals(otherGender.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
