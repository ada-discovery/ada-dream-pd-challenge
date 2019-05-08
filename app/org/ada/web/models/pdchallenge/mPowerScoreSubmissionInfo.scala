package org.ada.web.models.pdchallenge

case class mPowerScoreSubmissionInfo(
  Team: String,
  AUPR_Unbiased_Subset: Option[Double],
  AUROC_Full: Option[Double],
  AUROC_Unbiased_Subset: Option[Double],
  Rank_Full: Option[Int],
  Rank_Unbiased_Subset: Option[Int],
  submissionId: Option[String],
  submissionName: Option[String],
  featureNum: Option[Int]
) extends SubmissionInfo {

  override val submissionIdInt = try {
    submissionId.map(_.toInt)
  } catch {
    case e: NumberFormatException => None
  }

  override val RankFinal = Rank_Unbiased_Subset

  override val Rank = None

  override val AUPR = None
}
