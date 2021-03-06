/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.oaipmh.handler;

import java.util.List;

import org.apache.camel.oaipmh.component.OAIPMHConsumer;
import org.apache.camel.oaipmh.model.OAIPMHResponse;

public class ConsumerResponseHandler extends AbstractHandler implements ResponseHandler {

    public ConsumerResponseHandler(OAIPMHConsumer consumer) {
        super(consumer);
    }

    @Override
    public void process(OAIPMHResponse anyResponse) {
        send(anyResponse);
    }

    @Override
    public List<String> flush() {
        throw new UnsupportedOperationException();
    }

}
