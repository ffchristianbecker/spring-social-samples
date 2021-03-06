/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.movies.review;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class ReviewForm {
	
	private String netflixId;
	
	private String movieTitle;
	
	@NotNull
	@Size(min=1, max=200)
	private String text;
	
	public ReviewForm() {
	}
	
	public String getNetflixId() {
		return netflixId;
	}

	public void setNetflixId(String netflixId) {
		this.netflixId = netflixId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Review newReview(String username) {
		return new Review(movieTitle, username, new Date(), text, netflixId);
	}
}
