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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the flow that you want to describe. */
    private String flowArn;

    /**
     * The ARN of the flow that you want to describe.
     * 
     * @param flowArn
     *        The ARN of the flow that you want to describe.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow that you want to describe.
     * 
     * @return The ARN of the flow that you want to describe.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow that you want to describe.
     * 
     * @param flowArn
     *        The ARN of the flow that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlowRequest == false)
            return false;
        DescribeFlowRequest other = (DescribeFlowRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlowRequest clone() {
        return (DescribeFlowRequest) super.clone();
    }

}
