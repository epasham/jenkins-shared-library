#!/usr/bin/env groovy
import org.ejsl.jenkins.SlackNotifier

def call(webhookUrl, projectName, error) {
  slackNotifer = new SlackNotifier(this, webhookUrl)
  slackNotifer.notifySlack(projectName, error)
}
