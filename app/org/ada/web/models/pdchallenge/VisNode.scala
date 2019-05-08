package org.ada.web.models.pdchallenge

import play.api.libs.json.JsValue

case class VisNode(id: Int, size: Int, label: String, data: Option[JsValue])