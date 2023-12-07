package core.data

actual class ImageStorage {
    actual suspend fun saveImage(bytes: ByteArray): String {
        // TODO
        return ""
    }

    actual suspend fun getImage(fileName: String): ByteArray? {
        // TODO
        return ByteArray(0)
    }

    actual suspend fun deleteImage(fileName: String) {
        // TODO
    }
}