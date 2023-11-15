---
layout: page
---
<link rel="stylesheet" href="./assets/css/guide.css">
<a id="top"></a>
<br>
<br>
<br>
<br>
<br>
<br>
<div style="display: flex;">
    <div style="flex: 1; padding: 20px">
        <h1>User Guide</h1>
        <p>Everything you need to know about CCACommander Ultra Promax Xtra 9000PLUS</p>
    </div>
    <div style="flex: 1; padding: 20px">
        <img src="images/logo_removebg.png"
             alt="CCACommander Logo"
             >
    </div>
</div>

<br>
<br>

<div style="page-break-after: always;"></div>

## Table of Contents
{: .no_toc }
1. Table of Contents
{:toc}

<div style="page-break-after: always;"></div>

## Introduction
As a Co-curricular Activity (CCA) head, do you find yourself struggling to manage your CCA members’ attendances and record the array of events that your CCA has?
Are the heaps of spreadsheets you are using to manage them making you feel overwhelmed? Well, fear not, **CCACommander Ultra Promax Xtra 9000PLUS** is here to save the day!

CCACommander is a desktop application that helps CCA leaders record details of their members and events, whilst tracking every member’s attendance. 
It helps to organise members and events into easy-to-view compartments under a singular [Graphical User Interface (GUI)](https://blog.hubspot.com/website/what-is-gui) while providing granular control to you via its in-built [Command Line Interface (CLI)](https://www.techtarget.com/searchwindowsserver/definition/command-line-interface-CLI). 
If you can type quickly, CCACommander can help you complete your administrative tasks much more efficiently than traditional GUI applications.

## About
This user guide provides documentation on how you can install and use **CCACommander Ultra Promax Xtra 9000PLUS**. Descriptions of CCACommander’s features and how to use them have been carefully organised into key sections for your convenience.
To get started, take a look at our [quick start](#quick-start) guide!

This guide uses the following features to make it easier for you to navigate around:
* Words that look like [this](#about) can be clicked to jump to the related section.
* Words that look like `this` refer to commands which you can type into the command box of CCACommander.
* Words that look like <kbd>this</kbd> refer to keyboard keys that you can press.

<div markdown="block" class="alert alert-warning">
:warning: Boxes with the :warning: icon contain important information that you should read.
</div>

<div markdown="block" class="alert alert-info">
:information_source: Boxes with the :information_source: icon contain additional useful information.
</div>

<div markdown="block" class="alert alert-primary">
:bulb: Boxes with the :bulb: icon contain additional tips and tricks to help you get the most out of CCACommander.
</div>

--------------------------------------------------------------------------------------------------------------------
## Quick Start
<div markdown="block" class="alert alert-warning">

:warning: We assume that you have some basic knowledge of terminal commands. You can learn how to use the terminal with [this guide](https://www.freecodecamp.org/news/command-line-for-beginners/).

</div>

1. Ensure you have Java `11` installed in your computer by following [this guide](https://phoenixnap.com/kb/check-java-version-on-mac-windows).

2. Download the latest `ccacommander.jar` from [here](https://github.com/AY2324S1-CS2103T-F11-1/tp/releases).

3. Put the downloaded file into a folder of your choice (preferably a new empty folder).

4. Open a command terminal in the folder you put the CCACommander file in, and use the `java -jar ccacommander.jar` command to run the application. A GUI resembling the one shown below should appear in a few seconds. Note how the app contains some sample data.<br>
    <figure style="margin-bottom:200px">
        <img src="images/Ui.png"
             alt="Ui"
             style="margin-top:10px; max-width: 90%">
        <figcaption>Fig 1: Initial application display</figcaption>
    </figure>

5. Type the command in the command box and press <kbd>↵ Enter</kbd> to execute it. <br> E.g. typing `help` and pressing <kbd>↵ Enter</kbd> will open the help window. <br>
   Some example commands you can try:

    * `list` : Lists all members and events.

    * `createMember n/Lim Jun Jie g/Male p/98765432 e/limjunjie@gmail.com a/19 Kent Ridge Crescent, Singapore 119278`: Creates a member named "Lim Jun Jie" in CCACommander.

    * `deleteMember 3` : Deletes the 3rd member shown in the current list.

6. You can refer to the [Features](#features) section below for the details of each command.

<div markdown="block" class="alert alert-primary">

:bulb: You can use the `clear` command to remove the sample data.
</div>


--------------------------------------------------------------------------------------------------------------------

> [Back to top](#top)

<div style="page-break-after: always;"></div>

## Navigating User Interface
<figure>
    <img src="images/ui_breakdown.png"
         alt="UI_breakdown">
    <figcaption>Fig 2: Components of CCACommander</figcaption>
</figure>
Here are the important components of CCACommander that you will use and interact with.

**Menu**: The CCACommander menu is located at the top-left corner of your screen. Click the sub-menu items to execute the following:
1. File: Exit the program
2. Theme: Toggle between light and dark themes
    <figure>
        <img src="images/light_dark_theme.png"
             alt="Light and dark themes"
             style="margin-top:10px; max-width: 90%">
        <figcaption>Fig 3: Light and dark theme</figcaption>
   </figure>
3. Help: Access our user guide

**Command Box**: Type in your text commands. <br>
**Result Display**: View messages from CCACommander regarding your commands. <br>
**Member List**: View the members stored in CCACommander. <br>
**Event List**: View the events stored in CCACommander. <br>
**Storage Location**: Locate where your CCACommander data is stored in your computer.

## Command History
You can quickly recall previously entered commands for convenience as CCACommander stores almost all (see the info card below to see what commands are stored) commands entered by the user. 

Upon selecting the command box, you can use the <kbd>↑</kbd> to <kbd>↓</kbd> key to navigate through the commands entered.

Example:
1. You have just marked attendance for the first member in the member list using the `editEnrolment m/1 e/1 r/Present` command.
2. You can then use <kbd>↑</kbd> to get `editEnrolment m/1 e/1 r/Present`
3. You can edit the member index to get `editEnrolment m/2 e/1 r/Present` to mark the second member as present.

<div markdown="block" class="alert alert-info">:information_source: CCACommander will not store 2 of the same commands if they were entered twice in a row. Likewise, commands containing exclusively of blank spaces will not be stored as well.

Upon entering the <kbd>⌫ Backspace</kbd> or the <kbd>↵ Enter</kbd> key, users will have to re-navigate from the most recent command as it will be treated as an edit or entry of command.
</div>


--------------------------------------------------------------------------------------------------------------------

> [Back to top](#top)

<div style="page-break-after: always;"></div>

## Features

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the fields to be supplied by the user.<br>
  E.g. in `createMember n/NAME`, `NAME` is a field which can be used as `createMember n/John Doe`.

* Items in square brackets are optional.<br>
  E.g. `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  E.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

* Fields can be in any given order.<br>
  E.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* Some fields of certain commands have constraints on the acceptable inputs. <br>
  You can refer to the [List of Acceptable Values](#list-of-acceptable-values) section below for more details.

* Unnecessary fields for commands that do not take in fields (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  E.g. if the command specifies `help 123`, it will be interpreted as `help`.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.
</div>

<hr class="feature-class-separator">

> [Back to top](#top)

<div style="page-break-after: always;"></div>

### Member Commands
The vitality of a CCA lies in its members. CCACommander allows you to manage your members with the commands below:

#### Create a Member: `createMember`
When you first start CCACommander and want to populate CCACommander with your members, you can do it with just one simple command - `createMember`!

Here's how you can use it:<br>
`createMember n/MEMBER_NAME g/GENDER [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`

Here is an example command where we create a member **named** "Lim Jun Jie" with **gender** "Male", **phone number** of "83498018", **email** of "limjunjie@gmail.com", home **address** of "19 Kent Ridge Crescent, Singapore 119278" and a "publicity" **tag**:

`createMember n/Lim Jun Jie g/Male p/83498018 e/limjunjie@gmail.com a/19 Kent Ridge Crescent, Singapore 119278 t/publicity`

<figure>
    <img src="images/createMemberPostCommand.png"
         alt="createMember Post Command">
    <figcaption>Fig 4: After executing the <code>createMember</code> command</figcaption>
</figure>

<hr class="command-separator">

<div style="page-break-after: always;"></div>

#### Edit a Member: `editMember`
If you accidentally make a typo while creating your member, do not worry! You can quickly fix it with the `editMember` command.

Here's how you can use it:<br>
`editMember MEMBER_INDEX [n/MEMBER_NAME] [g/GENDER] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`

<div markdown="block" class="alert alert-info">
:information_source: Remember to provide at least one field to be edited!
</div>

Here is an example command where we edit the member at **index** 1, changing their **phone number** to "91234567" and **email** to "johndoe@example.com":

`editMember 1 p/91234567 e/johndoe@example.com`

<hr class="command-separator">

#### Delete a Member: `deleteMember`

If a member leaves your CCA, get over the disappointment by swiftly removing them from CCACommander using the `deleteMember` command!

Here's how you can use it:<br>
 `deleteMember MEMBER_INDEX`

Here is an example command where we delete the member at **index** 1:

`deleteMember 1`

<div markdown="block" class="alert alert-info">
:information_source: The `MEMBER_INDEX` field refers to the index number shown in the **currently displayed** member list.
</div>

<hr class="feature-class-separator">

> [Back to top](#top)

<div style="page-break-after: always;"></div>

### Event Commands

As a CCA head, keeping track of event details is a major responsibility. CCACommander allows you to do so with the event-related commands below:

#### Create an Event: `createEvent`

Creating a new event is no longer a hassle as it can be done with just one simple command - `createEvent`!

Here's how you can use it:<br>
`createEvent n/EVENT_NAME l/LOCATION d/DATE [t/TAG]...`

Here is an example command where we create an event **named** "Exco Planning" held at the **location** "Planning Room" on the
**date** 2023-12-10, with **tag** "Sem1":

`createEvent n/Exco Planning l/Planning Room d/2023-12-10 t/Sem1`

<figure>
    <img src="images/CreateEventPostCommand.png"
         alt="createEvent Post Command">
    <figcaption>Fig 5: After executing the <code>createEvent</code> command</figcaption>
</figure>

<hr class="command-separator">

<div style="page-break-after: always;"></div>

#### Edit an Event: `editEvent`

If you forget to note any important details, or realise that you made a mistake in any field of the event created,
the `editEvent` command is here to help!

Here's how you can use it:<br>
`editEvent EVENT_INDEX [n/EVENT_NAME] [l/LOCATION] [d/DATE] [t/TAG]...`

<div markdown="block" class="alert alert-info">
:information_source: Remember to provide at least one field to be edited!
</div>

Here is an example command where we edit an event at **index** 1, changing the **location** to be "MBS" and the **date** to be "2023-10-20":

`editEvent 1 l/MBS d/2023-10-20`

<hr class="command-separator">

#### Delete an Event: `deleteEvent`

Are your events piling up? To clear the clutter, you can delete any unwanted event from CCACommander with `deleteEvent`!

Here's how you can use it:<br>
`deleteEvent EVENT_INDEX`

Here is an example command where we delete the event at **index** 1:

`deleteEvent 1`

<div markdown="block" class="alert alert-info">:information_source: The `EVENT_INDEX` field refers to the index number shown in the **currently displayed** event list.
</div>

<hr class="feature-class-separator">

> [Back to top](#top)

<div style="page-break-after: always;"></div>

### Enrolment Commands

Enrolments are a way for you to manage your members’ involvements in your events. The enrolment commands below are the bread-and-butter for your participation tracking needs:

#### Enrol a Member to an Event: `enrol`

Now that you have added all your members and all your events, keeping track of your members’ attendance to any event is as simple as using the `enrol` command!

Here’s how you can use it:<br>
`enrol m/MEMBER_INDEX e/EVENT_INDEX [h/NUMBER_OF_HOURS] [r/REMARK]`

Here is an example command where we enrol the member at **member index** 1 to the event at **event index** 1, where our member
has contributed 2 **hours**, and we want to leave a "Role: Photographer" **remark** to reflect their role as a photographer:

`enrol m/1 e/1 h/2 r/Role: Photographer`

<hr class="command-separator">

#### Edit an Enrolment: `editEnrolment`
Accidentally mixed up two members and gave them the wrong number of hours or wrong remarks for the event they are involved in?
You can fix this with ease by using the `editEnrolment` command!

Here’s how you can use it:<br>
`editEnrolment m/MEMBER_INDEX e/EVENT_INDEX [h/NUMBER_OF_HOURS] [r/REMARK]`

<div markdown="block" class="alert alert-info">
:information_source: Remember to provide at least one field to be edited!
</div>

Here is an example command where we edit the enrolment of the member at **member index** 1 to the event at **event index** 2,
changing the number of **hours** to 5 and the **remark** to "Role: Exco" to reflect the member’s role as an exco member:

`editEnrolment m/1 e/2 h/5 r/Role: Exco`

<hr class="command-separator">

<div style="page-break-after: always;"></div>
#### Unenrol a Member from an Event: `unenrol`
If your member is no longer involved in a particular event, you can easily remove them from the event by using the `unenrol` command!

Here’s how you can use it:<br>
`unenrol m/MEMBER_INDEX e/EVENT_INDEX`

Here is an example command where we unenrol the member at **member index** 1 from the event at **event index** 1:

`unenrol m/1 e/1`

<div markdown="block" class="alert alert-info">:information_source: The `MEMBER_INDEX`/`EVENT_INDEX` field refers to the index number shown in the **currently displayed** member/event list.
</div>

<hr class="feature-class-separator">

> [Back to top](#top)

<div style="page-break-after: always;"></div>

### View Commands
In CCACommander, you can quickly change the view to fit your current use case, be it to check for the enrolment of an event, 
searching for a member and more!

#### View Events of Member: `viewMember`

If you want to view the events in which a particular member is enrolled to, you can do so via the `viewMember` command.

Here’s how you can use it:<br>
`viewMember MEMBER_INDEX`

Here is an example command where we want to view the events in which the **member** at index 3 in our member list is enrolled to:

`viewMember 3`

<figure>
    <img src="images/viewMemberPreCommand.png"
         alt="viewMember Pre Command">
    <figcaption>Fig 6: Before executing the <code>viewMember</code> command</figcaption>
</figure>
<br>
<figure>
    <img src="images/viewMemberPostCommand.png"
         alt="viewMember Post Command">
    <figcaption>Fig 7: After executing the <code>viewMember</code> command</figcaption>
</figure>

<hr class="command-separator">

#### View Members of Event: `viewEvent`

If you want to view the members which a particular event has, you can do so via the `viewEvent` command.

Here’s how you can use it:<br>
`viewEvent EVENT_INDEX`

Here is an example command where we want to view the members that the **event** at index 1 of our event list has:

`viewEvent 1`

<figure>
    <img src="images/viewEventPreCommand.png"
         alt="viewEvent Pre Command">
    <figcaption>Fig 8: Before executing the <code>viewEvent</code> command</figcaption>
</figure>
<br>
<figure>
    <img src="images/viewEventPostCommand.png"
         alt="viewEvent Post Command">
    <figcaption>Fig 9: After executing the <code>viewEvent</code> command</figcaption>
</figure>

<hr class="command-separator">

#### Find Member in member list: `findMember`

If your CCA contains many members and you don’t want to scroll past tens or hundreds of members, you can use the 
`findMember` command to instantly filter a list of members with a matching name.

Do you want to find multiple members? Fear not as you can simply add more names one after another.

Here’s how you can use it:<br>
`findMember MEMBER_NAME [MORE_NAMES]...`

Here is an example command where we find all members with the names of "Anthony" and "Nicholas":

`findMember anthony nicholas`

<hr class="command-separator">

#### Find Event in event list: `findEvent`

Similar to `findMember`, `findEvent` allows you to instantly find your event among your multiple events.

Here’s how you can use it:<br>
`findEvent EVENT_NAME [MORE_NAMES]...`

Here is an example command where we find all events with the event name of "Party":

`findEvent party`

<div markdown="block" class="alert alert-info">:information_source:
The find commands require the names to be typed in full, meaning "Nich" will not suffice for finding "Nicholas". 
The names do not have to be capitalised too! 
</div>

<div markdown="block" class="alert alert-primary">:bulb:
The find commands are powerful tools to help you work faster. Want to view the attendance of Nicholas, but you don’t 
want to scroll the member list? Use the `findMember` then follow it with the `viewMember` command to achieve that. 
This is applicable for both members and events!
</div>

<hr class="command-separator">

#### List all Members and all Events: `list`
If you’re in the event/member view, you can always use the `list` command to return to the default view with all members and events.

Here’s how you use it: `list`

<hr class="feature-class-separator">

> [Back to top](#top)

<div style="page-break-after: always;"></div>

### Utility Commands
CCACommander provides you with powerful utility commands to make your admin tasks even more of a breeze than it was.

#### Undoing a command: `undo`

The `undo` command is the ultimate safety net for CCACommander. You no longer have to fear accidentally deleting 
the wrong event or enrolling the wrong member. Simply enter the `undo` command to undo your previous command, 
and it will return to the previous state.

Here’s how you can use it:<br>
`undo`

Here's a list of commands you can undo:
* `clear`
* `createMember`
* `deleteMember`
* `editMember`
* `createEvent`
* `deleteEvent`
* `editEvent`
* `enrol`
* `unenrol`
* `editEnrolment`

<hr class="command-separator">

#### Redoing a command: `redo`

Accidentally used `undo`? Don’t worry, you can redo your undone commands too!

Here’s how you can use it:<br>
`redo`

<hr class="command-separator">

#### Clear all Members and Events: `clear`
Is it time for a new academic year when you need to remove all your previous members and events for new members and 
events? You can use the `clear` command to instantly remove all your members and events without needing to delete them one by one.

Here’s how you can use it:<br>
`clear`

<div markdown="block" class="alert alert-primary">:bulb: Accidentally cleared your list? 
Fret not as you can use the `undo` command to recover your data! 

</div>

<hr class="command-separator">

#### Help: `help`

Forgot how to edit a specific enrolment or how to unenrol members? The `help` command will allow you to clarify and recall any features of CCACommander by providing you with a link to our friendly and informative user guide.

Here’s how you can use it:<br>
`help`

<figure>
    <img src="images/helpWindow.png"
         alt="Help Window">
    <figcaption>Fig 10: A help pop-up window will appear upon entering the <code>help</code> command</figcaption>
</figure>

<hr class="command-separator">

#### Exit: `exit`

If it’s time to call it a day for your CCA tasks, you can use the `exit` command to quit the app.

Here’s how you can use it:<br>
`exit`

<div markdown="block" class="alert alert-info">:information_source: The <code>exit</code> command exists for your convenience. 
It performs the same task as the cross in the top bar and the Exit button in the File sub-menu item.
</div>

<hr class="command-separator">

#### Saving the data

CCACommander data are saved automatically after any command that changes the data. There is no need to save manually.

<hr class="feature-class-separator">

> [Back to top](#top)


## FAQ

**Q**: How do I transfer my data to another computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous CCACommander folder.

**Q**: Do I need Wi-Fi connection to use CCACommander?<br>
**A**: No, you can use CCACommander offline.

**Q**: How much storage space do I need for CCACommander?<br>
**A**: CCACommander is so lightweight that you only need 30 MB on your computer.

**Q**: What happens if my laptop battery dies suddenly?<br>
**A**: Rest assured, your data remains securely stored on your laptop. 
Once your laptop is recharged, you can regain access to all your stored information.

--------------------------------------------------------------------------------------------------------------------

## Glossary
This glossary provides definitions for the special terms used in this user guide.

**CCA**: Co-curricular activity.

**Command**: The text typed in by the user as a CCA Head for CCACommander.

**Index**: The number beside the corresponding entry in a list.

**Tag**: A word or phrase that labels a member or an event.

--------------------------------------------------------------------------------------------------------------------

<div style="page-break-after: always;"></div>

## Command Summary

Action | Format, Examples
--------|------------------
[**Create a Member**](#create-a-member-createmember) | `createMember n/MEMBER_NAME g/GENDER [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...` <br> e.g. `createMember n/Lim Jun Jie g/Male p/83498018 e/limjunjie@gmail.com a/19 Kent Ridge Crescent, Singapore 119278 t/publicity`
[**Edit a Member**](#edit-a-member-editmember) | `editMember MEMBER_INDEX [n/MEMBER_NAME] [g/GENDER] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...` <br> e.g.`editMember 1 p/91234567 e/johndoe@example.com`
[**Delete a Member**](#delete-a-member-deletemember) | `deleteMember MEMBER_INDEX` <br> e.g.`deleteMember 1`
[**Create an Event**](#create-an-event-createevent) | `createEvent n/EVENT_NAME [l/LOCATION] [d/DATE] [t/TAG]...` <br> e.g.`createEvent n/Party l/Raffles Hall d/2023-09-16 t/Dinner t/Sem1`
[**Edit an Event**](#edit-an-event-editevent) | `editEvent EVENT_INDEX [n/EVENT_NAME] [l/LOCATION] [d/DATE] [t/TAG]...` <br> e.g. `editEvent 1 l/MBS d/2023-10-20`
[**Delete an Event**](#delete-an-event-deleteevent) | `deleteEvent EVENT_INDEX` <br> e.g.`deleteEvent 1`
[**Enrol a Member to an Event**](#enrol-a-member-to-an-event-enrol) | `enrol m/MEMBER_INDEX e/EVENT_INDEX [h/NUMBER_OF_HOURS] [r/REMARK]` <br> e.g.`enrol m/1 e/1 h/2 r/Role: Photographer`
[**Edit an Enrolment**](#edit-an-enrolment-editenrolment) | `editEnrolment m/MEMBER_INDEX e/EVENT_INDEX [h/NUMBER_OF_HOURS] [r/REMARK]` <br> e.g. `editEnrolment m/1 e/2 h/5 r/Role: Exco`
[**Unenrol Member from an Event**](#unenrol-a-member-from-an-event-unenrol) | `unenrol m/MEMBER_INDEX e/EVENT_INDEX` <br> e.g.`unenrol m/1 e/1`
[**View Events of Member**](#view-events-of-member-viewmember) | `viewMember MEMBER_INDEX` <br> e.g.`viewMember 3`
[**View Members of Event**](#view-members-of-event-viewevent) | `viewEvent EVENT_INDEX` <br> e.g.`viewEvent 1`
[**Find Member in member list**](#find-member-in-member-list-findmember) | `findMember MEMBER_NAME [MORE_NAMES]...` <br> e.g.`findMember anthony nicholas`
[**Find Event in event list**](#find-event-in-event-list-findevent) | `findEvent EVENT_NAME [MORE_NAMES]...` <br> e.g.`findEvent party marathon`
[**List all Members and all Events**](#list-all-members-and-all-events-list) | `list`
[**Undo**](#undoing-a-command-undo) | `undo`
[**Redo**](#redoing-a-command-redo) | `redo`
[**Clear all Members and Events**](#clear-all-members-and-events-clear) | `clear`
[**Help**](#help-help) | `help`
[**Exit**](#exit-exit) | `exit`

> [Back to top](#top)

<div style="page-break-after: always;"></div>

## List of Acceptable Values

<table class="tg">
<thead>
  <tr>
    <th class="tg-0pky"><span>Command</span></th>
    <th class="tg-0pky"><span>Field</span></th>
    <th class="tg-0pky"><span>Acceptable values</span></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky command" rowspan="6"><code>createMember</code> / <code>editMember</code></td>
    <td class="tg-0pky">MEMBER_NAME</td>
    <td class="tg-0pky">Only contain alphanumeric characters and spaces, and should not be blank</td>
  </tr>
  <tr>
    <td class="tg-0pky">GENDER</td>
    <td class="tg-0pky"><code>Male</code>, <code>Female</code>, <code>Others</code></td>
  </tr>
  <tr>
    <td class="tg-0pky">PHONE_NUMBER</td>
    <td class="tg-0pky">Only contain numbers, and <span>at least 3 digits long</span></td>
  </tr>
  <tr>
    <td class="tg-0pky">EMAIL</td>
    <td class="tg-0pky">An email with a valid extension (e.g. <code>@gmail.com</code>)</td>
  </tr>
  <tr>
    <td class="tg-0pky">ADDRESS</td>
    <td class="tg-0pky">Any non-blank values except the following prefixes: <code>n/</code>, <code>g/</code>, <code>p/</code>, <code>e/</code>, <code>a/</code>, <code>t/</code></td>
  </tr>
  <tr>
    <td class="tg-0pky">TAG</td>
    <td class="tg-0pky">Only contain alphanumeric characters with no spaces in between, but can be blank</td>
  </tr>
  <tr>
    <td class="tg-0pky command" rowspan="4"><code>createEvent</code> / <code>editEvent</code></td>
    <td class="tg-0pky">EVENT_NAME</td>
    <td class="tg-0pky">Only contain alphanumeric characters and spaces, and should not be blank</td>
  </tr>
  <tr>
    <td class="tg-0pky">LOCATION</td>
    <td class="tg-0pky"><span>Must not be blank </span>and can take in any values, except the following prefixes:<code>e/</code>, <code>l/</code>, <code>d/</code>, <code>t/</code></td>
  </tr>
  <tr>
    <td class="tg-0pky">DATE</td>
    <td class="tg-0pky">Must be a <span>valid date </span>in the format of <span>YYYY-MM-DD</span></td>
  </tr>
  <tr>
    <td class="tg-0pky">TAG</td>
    <td class="tg-0pky">Only contain alphanumeric characters with no spaces in between, but can be blank</td>
  </tr>
  <tr>
    <td class="tg-0pky command"><code>deleteMember</code> / <code>deleteEvent</code></td>
    <td class="tg-0pky">MEMBER_INDEX / EVENT_INDEX</td>
    <td class="tg-0pky">Must be a<span> positive integer</span> that is within the range of the length of the <span>currently displayed</span> member/event list</td>
  </tr>
  <tr>
    <td class="tg-0pky command" rowspan="3"><code>enrol</code> / <code>editEnrolment</code></td>
    <td class="tg-0pky">MEMBER_INDEX / EVENT_INDEX</td>
    <td class="tg-0pky">Must be a <span>positive integer</span> that is within the range of the length of the <span>currently displayed</span> member/event list</td>
  </tr>
  <tr>
    <td class="tg-0pky">NUMBER_OF_HOURS</td>
    <td class="tg-0pky">Must be a<span> positive integer </span>and must be <span>less than or equal to 2147483647</span></td>
  </tr>
  <tr>
    <td class="tg-0pky">REMARK</td>
    <td class="tg-0pky"><span>Must not be blank </span>and can take in any values, except the following prefixes:<code>m/</code>, <code>e/</code>, <code>h/</code>, <code>r/</code></td>
  </tr>
  <tr>
    <td class="tg-0pky command"><code>viewMember</code> / <code>viewEvent</code></td>
    <td class="tg-0pky">MEMBER_INDEX / EVENT_INDEX</td>
    <td class="tg-0pky">Must be a <span>positive integer</span> that is within the range of the length of the <span>currently displayed</span> member/event list</td>
  </tr>
  <tr>
    <td class="tg-0pky command"><code>findMember</code> / <code>findEvent</code></td>
    <td class="tg-0pky">MEMBER_NAME / EVENT_NAME / MORE_NAMES</td>
    <td class="tg-0pky">Any non-blank values</td>
  </tr>
</tbody>
</table>

> [Back to top](#top)
