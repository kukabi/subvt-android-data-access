package io.helikon.subvt.data.model.substrate

import java.math.BigInteger

data class ValidatorStake(
    val account: Account,
    val selfStake: BigInteger,
    val totalStake: BigInteger,
    val nominators: List<NominatorStake>,
)

data class ValidatorStakeSummary(
    val selfStake: BigInteger,
    val totalStake: BigInteger,
    val nominatorCount: Int,
)