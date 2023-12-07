package contacts.data

import contacts.domain.Contact
import core.data.ImageStorage
import database.ContactEntity


suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(imagePath) }
    )
}