package di

import android.content.Context
import com.gmail.orlandroyd.contactskmp.database.ContactDatabase
import contacts.data.SqlDelightContactDataSource
import contacts.domain.ContactDataSource
import core.data.DatabaseDriverFactory
import core.data.ImageStorage

actual class AppModule(
    private val context: Context
) {

    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create(),
            ),
            imageStorage = ImageStorage(context)
        )
    }
}