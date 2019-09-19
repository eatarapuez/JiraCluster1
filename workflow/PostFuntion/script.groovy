package workflows.postfunctions

import com.atlassian.jira.config.util.JiraHome
import com.atlassian.jira.component.ComponentAccessor

JiraHome jiraHome = ComponentAccessor.getComponent(JiraHome.class);

Properties config=(Properties)evaluate (new File(String.format("%s/scripts/JiraCluster1/config.groovy",jiraHome.getHomePath())))
Long customfieldPuesto =Long.parseLong(config.getProperty("fields.numeroDocumento.id"))

log.error customfieldPuesto
