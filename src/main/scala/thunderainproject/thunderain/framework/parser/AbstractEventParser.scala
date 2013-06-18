package thunderainproject.thunderain.framework.parser

import thunderainproject.thunderain.framework.Event

abstract class AbstractEventParser extends Serializable {
  
  /**
   * parse the input event string, should be implemented by derivative
   * @param event: input event string
   * @return Event
   */
  def parseEvent(event: String, schema: Array[String]): Event
}