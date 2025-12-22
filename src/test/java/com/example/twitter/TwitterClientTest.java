package com.example.twitter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TwitterClientTest {

	@Mock
    private ITweet tweet;

	@Test
	void ensureThatTwitterClientCallsGetMessageOnTweet() {
		TwitterClient twitterClient = new TwitterClient();

		when(tweet.getMessage()).thenReturn("Using mockito is great");

		twitterClient.sendTweet(tweet);
		verify(tweet, atLeastOnce()).getMessage();

	}

}