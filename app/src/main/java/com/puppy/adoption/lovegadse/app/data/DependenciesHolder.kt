package com.puppy.adoption.lovegadse.app.data

interface DependenciesHolder {
    val puppyRepository: PuppyRepository
}

class DependenciesHolderImpl() : DependenciesHolder {
    override val puppyRepository by lazy { PuppyRepository() }
}