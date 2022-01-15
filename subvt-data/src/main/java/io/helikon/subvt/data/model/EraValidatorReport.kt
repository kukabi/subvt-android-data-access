package io.helikon.subvt.data.model

import java.math.BigInteger

data class EraValidatorReport(
    val era: Era,
    val isActive: Boolean?,
    val commissionPerBillion: Long?,
    val selfStake: BigInteger?,
    val totalStake: BigInteger?,
    val blockCount: Int,
    val rewardPoints: BigInteger?,
    val selfReward: BigInteger,
    val stakerReward: BigInteger,
    val offlineOffenceCount: Int,
    val slashedAmount: BigInteger,
    val chillingCount: Int,
)