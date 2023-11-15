---
layout: page
title: Nhat's Project Portfolio Page
---

### Project: CCACommander Ultra Promax Xtra 9000PLUS

CCACommander Ultra Promax Xtra 9000PLUS is a one-stop application for CCA Heads to manage CCA members and events, optimised for CCA Heads who prefer to use CLI.
My team and I adapted the product from an existing Java application called [Address Book (Level 3)](https://se-education.org/addressbook-level3/) over a span of 1.5 months.

Given below is a summary of my contributions to the project. All my contributions can be found at this [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=ph-nathan&breakdown=true#/).

### Features Implemented
I implemented the UI [#114](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/114),
`editEvent` [#160](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/160),
`list` [#181](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/181),
`viewMember` [#181](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/181),
`viewEvent` [#181](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/181).
Relevant tests were added for the commands. Details of some non-trivial commands are stated below.
* **Designed a new UI for CCACommander** [#114](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/114)
  * **Feature details:** Changing the UI layout, color theme and logo of application.
  * **Justifications:** The change in design is needed because CCACommander's core is in tracking both members and events,
    hence the two respective columns must be presented. With the new design, users are able to see both members and events simultaneously.

* **View Members of Event Feature** [#181](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/181)
  * **Feature details:** Allows users to view all the members attending an event.
  * **Justifications:** Gives the user the ability to quickly see the members participation of an event and the contribution of each member (hours and remark).

* **View Events of Member Feature** [#181](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/181)
  * **Feature details:** Allows users to view all the events a member is involved in.
  * **Justifications:** Gives the user the ability to quickly see the list of events of a member and their contribution in each event (hours and remark).

### Enhancements to existing features:
* **Fix `editMember` and `editEvent` commands logic to also update enrolment:** [#182](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/182) [#192](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/192)
  * **Enhancement details:** The enrolments' details of a member (event) is updated, if affected by the edit member (event) command.
  * **Justification:** Enrolment links a member and an event based on their names. Previously when the identity (name) of a member/event is edited via the edit commands, the existing name fields for enrolment wasn't updated.
  I have updated the logic to also modify the enrolment object when the name field is edited.

* **Enhance UI and add toggle light/dark theme feature for UI:** [#194](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/194)
  * **Enhancement details:** Users can toggle between light and dark mode.
  * **Credits:** Implementation is adapted by Tutor’s Pet

* **Fix `editEnrolment` command** [#265](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/265)
  * **Enhancement details:** Previously, the edited enrolment details (hours, remarks) are correctly stored but not updated to UI automatically,
    this causes confusion to users. Hence, enhancement were made so that the changes is reflected in UI.

### Documentation:
* **User Guide**
  * Updated non-command sections: Introduction, About, Quick Start, Navigate UI, Command History, Notes for command format.
  * Added command details and summaries for `enrol`, `unenrol` commands for draft UG.
* **Developer Guide**
  * Added diagram for updated UI, Member and Event class, updated general model class diagram.
  * Updated parts of old diagrams where there were instances of AddressBook [#174](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/174)
  * Added alternative design consideration for Member and Event sections.
  * Added glossary section and use cases: UC09 - Add member to an event, UC10 - Delete member from an event.

### Community:
* This is the full [list](https://github.com/AY2324S1-CS2103T-F11-1/tp/pulls?q=is%3Apr+reviewed-by%3Aph-nathan) of pull requests which I have reviewed.
* Some non-trivial pull requests which I have reviewed: [#84](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/84), [#99](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/99).
