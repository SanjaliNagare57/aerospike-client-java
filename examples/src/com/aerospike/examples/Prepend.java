/*
 * Copyright 2012-2021 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.examples;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.Record;

public class Prepend extends Example {

	public Prepend(Console console) {
		super(console);
	}

	/**
	 * Prepend string to an existing string.
	 */
	@Override
	public void runExample(AerospikeClient client, Parameters params) throws Exception {
		Key key = new Key(params.namespace, params.set, "prependkey");
		String binName = params.getBinName("prependbin");

		// Delete record if it already exists.
		client.delete(params.writePolicy, key);

		Bin bin = new Bin(binName, "World");
		console.info("Initial prepend will create record.  Initial value is " + bin.value + '.');
		client.prepend(params.writePolicy, key, bin);

		bin = new Bin(binName, "Hello ");
		console.info("Prepend \"" + bin.value + "\" to existing record.");
		client.prepend(params.writePolicy, key, bin);

		Record record = client.get(params.policy, key, bin.name);

		if (record == null) {
			throw new Exception(String.format(
				"Failed to get: namespace=%s set=%s key=%s",
				key.namespace, key.setName, key.userKey));
		}

		// The value received from the server is an unsigned byte stream.
		// Convert to an integer before comparing with expected.
		Object received = record.getValue(bin.name);
		String expected = "Hello World";

		if (received.equals(expected)) {
			console.info("Prepend successful: ns=%s set=%s key=%s bin=%s value=%s",
				key.namespace, key.setName, key.userKey, bin.name, received);
		}
		else {
			console.error("Prepend mismatch: Expected %s. Received %s.", expected, received);
		}
	}
}
