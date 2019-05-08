package org.ada.web.models.pdchallenge

trait SubmissionInfo {
  def Team: String
  def Rank: Option[Int]
  def submissionIdInt: Option[Int]
  def featureNum: Option[Int]

  def AUPR: Option[Double]
  def AUPR_Unbiased_Subset: Option[Double]
  def AUROC_Full: Option[Double]
  def AUROC_Unbiased_Subset: Option[Double]
  def Rank_Full: Option[Int]
  def Rank_Unbiased_Subset: Option[Int]

  def RankFinal: Option[Int]
}
