---
layout: page
title: Dylan's Project Portfolio Page
---

### Project: CCACommander Ultra Promax Xtra 9000PLUS

### Overview

CCACommander Ultra Promax Xtra 9000PLUS is a one-stop application for CCA Heads to manage CCA members and events, optimised for CCA Heads who prefer to use command line interface.
My team and I adapted the product from an existing Java application called [Address Book (Level 3)](https://se-education.org/addressbook-level3/) over a span of 1.5 months.

Given below is a summary of my contributions to the project. All of my code contributions can be found in this [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=dylkaw&breakdown=true#/).

### Features Implemented
* **Create Event Feature** [#110](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/110)
    * **Feature details:** Allows the user of CCACommander to create a member in CCACommander's database.
    * **Justifications:** Gives the user the ability to add members to CCACommander so the user can keep track of them.
* **Enrol Feature** [#149](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/149)
    * **Feature details:** Allows the user of CCACommander to enrol a member to an event.
    * **Justifications:** Gives the user the ability to create associations between members and events to track members' participation in events.
* **Edit Enrolment Feature** [#178](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/178)
    * **Feature details:** Allows the user of CCACommander to edit the details of a specific member's enrolment to an event.
    * **Justifications:** Gives the user the ability to correct any mistakes in the details of the enrolment, or add more information.

### Enhancements to existing features
* Convert `Name` to a class shared by `Member` and `Event` [#109](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/109)
  * **Feature details:** Previously, `memberName` and `eventName` were two separate classes. They were consolidated into a single `Name` class.
  * **Justifications:** Since `memberName` and `eventName` are parsed in the same way with similar constraints, consolidating them into a
    single `Name` class reduces redundant and duplicate code.

### Project management
* In my role managing deliverables and deadlines, I would be in constant communication with my team members to check if they are
  on track to meet the deadlines set by the team lead and to check if they require any assistance.

### Documentation
* **User Guide**
  * Added command usage and descriptions for the following commands: `viewEvent`, `viewMember` and `editAttendance`.
* **Developer Guide**
  * Added implementation details for the `enrol` feature.
  * Added 4 planned enhancements:
    * Allow users to delete values from optional fields in member/event/enrolment
    * Improve `findMember`/`findEvent` criteria
    * Make UI stay on current view upon `editMember`/`editEvent`
    * Make UI stay on current view upon `undo`/`redo`
  * Added 2 Use Cases:
    * UC05 - View members of event
    * UC06 - View events of member
  * Added non-functional requirements.
  * Added Appendix B: Instructions for manual testing.

### Community
* This is the full [list](https://github.com/AY2324S1-CS2103T-F11-1/tp/pulls?q=is%3Apr+reviewed-by%3Adylkaw) of pull requests which I have reviewed.
* Here are some of the pull requests which I have left non-trivial comments on: [#110](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/110), [#144](https://github.com/AY2324S1-CS2103T-F11-1/tp/pull/144)
