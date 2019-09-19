package workflows.postfunctions

import com.atlassian.jira.config.util.JiraHome
import com.atlassian.jira.component.ComponentAccessor

JiraHome jiraHome = ComponentAccessor.getComponent(JiraHome.class);

Properties config=(Properties)evaluate (new File(String.format("%s/scripts/JiraCluster1/config.groovy",jiraHome.getHomePath())))
Long cfNumeroDocumento =Long.parseLong(config.getProperty("fields.numeroDocumento.id"))
def numeroDocumento=issue.getCustomFieldValue(cfNumeroDocumento)
log.error "id cf: "+customfieldPuesto
log.error "valor Numero: "+ numeroDocumento

