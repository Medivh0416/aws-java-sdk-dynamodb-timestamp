/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model;

/**
 * <p>
 * The output for a DescribeStacks action.
 * </p>
 */
public class DescribeStacksResult {

    /**
     * A list of stack structures.
     */
    private java.util.List<Stack> stacks;

    /**
     * A list of stack structures.
     *
     * @return A list of stack structures.
     */
    public java.util.List<Stack> getStacks() {
        
        if (stacks == null) {
            stacks = new java.util.ArrayList<Stack>();
        }
        return stacks;
    }
    
    /**
     * A list of stack structures.
     *
     * @param stacks A list of stack structures.
     */
    public void setStacks(java.util.Collection<Stack> stacks) {
        if (stacks == null) {
            this.stacks = null;
            return;
        }

        java.util.List<Stack> stacksCopy = new java.util.ArrayList<Stack>(stacks.size());
        stacksCopy.addAll(stacks);
        this.stacks = stacksCopy;
    }
    
    /**
     * A list of stack structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stacks A list of stack structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStacksResult withStacks(Stack... stacks) {
        if (getStacks() == null) setStacks(new java.util.ArrayList<Stack>(stacks.length));
        for (Stack value : stacks) {
            getStacks().add(value);
        }
        return this;
    }
    
    /**
     * A list of stack structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stacks A list of stack structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStacksResult withStacks(java.util.Collection<Stack> stacks) {
        if (stacks == null) {
            this.stacks = null;
        } else {
            java.util.List<Stack> stacksCopy = new java.util.ArrayList<Stack>(stacks.size());
            stacksCopy.addAll(stacks);
            this.stacks = stacksCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (stacks != null) sb.append("Stacks: " + stacks + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStacks() == null) ? 0 : getStacks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeStacksResult == false) return false;
        DescribeStacksResult other = (DescribeStacksResult)obj;
        
        if (other.getStacks() == null ^ this.getStacks() == null) return false;
        if (other.getStacks() != null && other.getStacks().equals(this.getStacks()) == false) return false; 
        return true;
    }
    
}
    