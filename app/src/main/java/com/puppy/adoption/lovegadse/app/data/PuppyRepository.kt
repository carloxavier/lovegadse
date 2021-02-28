package com.puppy.adoption.lovegadse.app.data

class PuppyRepository {
    fun puppies() = listOf(
        Puppy(
            name = "Joselo",
            description = "Very quiet pup",
            photoUrl = "https://images.pexels.com/photos/5732474/pexels-photo-5732474.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888"
        ),
        Puppy(
            name = "Michelina",
            description = "Super energetic but lovely",
            photoUrl = "https://images.pexels.com/photos/3818818/pexels-photo-3818818.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888"
        ),
        Puppy(
            name = "Paquita",
            description = "Clothes destroyer, be careful.. but will never harm people",
            photoUrl = "https://images.pexels.com/photos/2171583/pexels-photo-2171583.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888"
        ),
        Puppy(
            name = "Pedrin",
            description = "Loves to cuddle",
            photoUrl = "https://images.pexels.com/photos/69434/pexels-photo-69434.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888"
        ),
    )

    fun findPuppy(puppyID: String) = puppies().find { it.name == puppyID }
}

data class Puppy(
    val description: String,
    val name: String,
    val ownerPhoneNumber: String,
    val photoUrl: String,
)