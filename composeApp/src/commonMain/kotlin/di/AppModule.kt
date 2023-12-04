package di

import contacts.domain.ContactDataSource


expect class AppModule {
    val contactDataSource: ContactDataSource
}