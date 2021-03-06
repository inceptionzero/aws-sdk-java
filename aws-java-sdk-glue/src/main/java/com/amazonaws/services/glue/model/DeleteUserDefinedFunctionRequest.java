/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteUserDefinedFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUserDefinedFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID
     * is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database where the function is located.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the function definition to be deleted.
     * </p>
     */
    private String functionName;

    /**
     * <p>
     * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID
     * is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS
     *        account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID
     * is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS
     *         account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID
     * is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS
     *        account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserDefinedFunctionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the function is located.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the function is located.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the function is located.
     * </p>
     * 
     * @return The name of the catalog database where the function is located.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the function is located.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the function is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserDefinedFunctionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the function definition to be deleted.
     * </p>
     * 
     * @param functionName
     *        The name of the function definition to be deleted.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function definition to be deleted.
     * </p>
     * 
     * @return The name of the function definition to be deleted.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the function definition to be deleted.
     * </p>
     * 
     * @param functionName
     *        The name of the function definition to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserDefinedFunctionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUserDefinedFunctionRequest == false)
            return false;
        DeleteUserDefinedFunctionRequest other = (DeleteUserDefinedFunctionRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUserDefinedFunctionRequest clone() {
        return (DeleteUserDefinedFunctionRequest) super.clone();
    }

}
