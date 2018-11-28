/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Messages that provide the state of the flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Messages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Messages implements Serializable, Cloneable, StructuredPojo {

    /** A list of errors that might have been generated from processes on this flow. */
    private java.util.List<String> errors;

    /**
     * A list of errors that might have been generated from processes on this flow.
     * 
     * @return A list of errors that might have been generated from processes on this flow.
     */

    public java.util.List<String> getErrors() {
        return errors;
    }

    /**
     * A list of errors that might have been generated from processes on this flow.
     * 
     * @param errors
     *        A list of errors that might have been generated from processes on this flow.
     */

    public void setErrors(java.util.Collection<String> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<String>(errors);
    }

    /**
     * A list of errors that might have been generated from processes on this flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors that might have been generated from processes on this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Messages withErrors(String... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<String>(errors.length));
        }
        for (String ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * A list of errors that might have been generated from processes on this flow.
     * 
     * @param errors
     *        A list of errors that might have been generated from processes on this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Messages withErrors(java.util.Collection<String> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Messages == false)
            return false;
        Messages other = (Messages) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public Messages clone() {
        try {
            return (Messages) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.MessagesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
