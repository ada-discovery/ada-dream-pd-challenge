package org.ada.web.controllers.pdchallenge

import org.ada.web.controllers.EnumStringBindable
import org.ada.web.models.pdchallenge.AggFunction

object QueryStringBinders {
  implicit val aggFunctionQueryStringBinder = new EnumStringBindable(AggFunction)
}