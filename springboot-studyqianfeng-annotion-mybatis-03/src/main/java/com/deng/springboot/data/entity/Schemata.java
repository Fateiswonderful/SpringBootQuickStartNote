package com.deng.springboot.data.entity;


public class Schemata {

  private String catalogName;
  private String schemaName;
  private String defaultCharacterSetName;
  private String defaultCollationName;
  private String sqlPath;
  private String defaultEncryption;


  public String getCatalogName() {
    return catalogName;
  }

  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }


  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public String getDefaultCharacterSetName() {
    return defaultCharacterSetName;
  }

  public void setDefaultCharacterSetName(String defaultCharacterSetName) {
    this.defaultCharacterSetName = defaultCharacterSetName;
  }


  public String getDefaultCollationName() {
    return defaultCollationName;
  }

  public void setDefaultCollationName(String defaultCollationName) {
    this.defaultCollationName = defaultCollationName;
  }


  public String getSqlPath() {
    return sqlPath;
  }

  public void setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
  }


  public String getDefaultEncryption() {
    return defaultEncryption;
  }

  public void setDefaultEncryption(String defaultEncryption) {
    this.defaultEncryption = defaultEncryption;
  }

  @Override
  public String toString() {
    return "Schemata{" +
            "catalogName='" + catalogName + '\'' +
            ", schemaName='" + schemaName + '\'' +
            ", defaultCharacterSetName='" + defaultCharacterSetName + '\'' +
            ", defaultCollationName='" + defaultCollationName + '\'' +
            ", sqlPath='" + sqlPath + '\'' +
            ", defaultEncryption='" + defaultEncryption + '\'' +
            '}';
  }
}
