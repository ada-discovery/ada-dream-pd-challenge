package org.ada.web.models.pdchallenge

case class LDOPAScoreSubmissionInfo(
  Team: String,
  AUPR: Option[Double],
  Rank: Option[Int],
  submissionId: Option[Int],
  submissionName: Option[String],
  featureNum: Option[Int]
) extends SubmissionInfo {
  override val submissionIdInt = submissionId

  override val RankFinal = Rank

  override val AUPR_Unbiased_Subset = None

  override val AUROC_Full = None

  override val AUROC_Unbiased_Subset = None

  override val Rank_Full = None

  override val Rank_Unbiased_Subset = None
}
