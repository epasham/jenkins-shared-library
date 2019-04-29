package org.ejsl.jenkins;

class SlackNotifier {
  def script
  def webhookUrl

  SlackNotifier(script, webhookUrl) {
    this.script = script
    this.webhookUrl = webhookUrl
  }


}
