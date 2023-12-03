package contacts.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import contacts.domain.Contact
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactListViewModel : ViewModel() {

    private val _state = MutableStateFlow(
        ContactListState(
            contacts
        )
    )
    val state = _state.asStateFlow()

    var newContact: Contact? by mutableStateOf(null)
        private set

    fun onEvent(contactListEvent: ContactListEvent) {

    }

}

private val contacts = (1..50).map {
    Contact(
        id = it.toLong(),
        firstName = "Donald York $it",
        lastName = "Belinda Bridges $it",
        email = "roosevelt.cameron@example.com",
        phoneNumber = "(417) 738-6185",
        photoBytes = null
    )
}