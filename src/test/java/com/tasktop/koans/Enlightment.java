/**
 * (C) Copyright (c) 2015 Tasktop Technologies and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Holger Staudacher - initial implementation
 */
package com.tasktop.koans;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.CharSink;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.math.MathContext.DECIMAL32;
import static org.fusesource.jansi.Ansi.Color.*;

public class Enlightment {

	private final Result result;

	public Enlightment(Result result) {
		this.result = result;
	}

	public List<String> getPath() {
		if (result.wasSuccessful()) {
			return getEnlightment();
		} else {
			return Lists.newArrayList();
		}
	}

	private List<String> getEnlightment() {
		try (InputStream in = Enlightment.class.getResourceAsStream("/enlightment.txt")) {
			List<String> lines = CharStreams.readLines(new InputStreamReader(in, Charsets.UTF_8));
			return lines.stream().map(line -> color(CYAN, line)).collect(Collectors.toList());
		} catch (IOException shouldnotHappen) {
			throw new IllegalStateException(shouldnotHappen);
		}
	}

	private String color(Color color, String toColor) {
		if (Boolean.getBoolean("enable.ansi")) {
			return Ansi.ansi().eraseScreen().fg(color).a(toColor).toString();
		}
		return toColor;
	}

}
