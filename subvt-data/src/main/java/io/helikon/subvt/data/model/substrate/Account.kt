package io.helikon.subvt.data.model.substrate

data class Account(
    val id: AccountId,
    val identity: IdentityRegistration?,
    val parent: Account?,
    val childDisplay: String?,
    val discoveredAt: Long?,
    val killedAt: Long?,
)