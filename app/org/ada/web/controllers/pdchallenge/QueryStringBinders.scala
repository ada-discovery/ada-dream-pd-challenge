package org.ada.web.controllers.pdchallenge

import org.ada.web.models.pdchallenge.AggFunction
import org.incal.play.formatters.EnumStringBindable

object QueryStringBinders {
  implicit val aggFunctionQueryStringBinder = new EnumStringBindable(AggFunction)
}