package contacts.presentation

import contacts.domain.Contact

sealed interface ContactListEvent {
    data object OnAddNewContactClick : ContactListEvent
    data object DismissContact : ContactListEvent
    data class OnFirstNameChange(val value: String) : ContactListEvent
    data class OnLastNameChange(val value: String) : ContactListEvent
    data class OnEmailChange(val value: String) : ContactListEvent
    data class OnPhoneNumberChange(val value: String) : ContactListEvent
    class OnPhotoPicked(val bytes: ByteArray) : ContactListEvent
    data object OnAddPhotoClick : ContactListEvent
    data object OnSaveContact : ContactListEvent
    data class SelectContact(val contact: Contact) : ContactListEvent
    data class EditContact(val contact: Contact) : ContactListEvent
    data object DeleteContact : ContactListEvent
}