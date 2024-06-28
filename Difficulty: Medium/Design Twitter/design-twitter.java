//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Twitter obj = new Twitter();
        int total_queries = sc.nextInt();

        while (total_queries-- > 0) {
            int query = sc.nextInt();

            // if query = 1, postTweet()
            // if query = 2, getNewsFeed()
            // if query = 3, follow()
            // if query = 4, unfollow()

            if (query == 1) {
                int userId = sc.nextInt(), tweetId = sc.nextInt();

                obj.postTweet(userId, tweetId);
            } else if (query == 2) {
                int userId = sc.nextInt();

                List<Integer> vec = obj.getNewsFeed(userId);
                for (int a : vec) System.out.print(a + " ");
                System.out.println();
            } else if (query == 3) {
                int follower = sc.nextInt(), followee = sc.nextInt();
                obj.follow(follower, followee);
            } else {
                int follower = sc.nextInt(), followee = sc.nextInt();
                obj.unfollow(follower, followee);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Twitter {
        
    private static int timestamp = 0;

    private static class Tweet {
        int id;
        int time;
        
        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    private Map<Integer, Set<Integer>> followersMap;
    private Map<Integer, List<Tweet>> tweetsMap;

    public Twitter() {
        followersMap = new HashMap<>();
        tweetsMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweetsMap.putIfAbsent(userId, new ArrayList<>());
        tweetsMap.get(userId).add(new Tweet(tweetId, timestamp++));
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);
        
        // Add user's own tweets to the heap
        if (tweetsMap.containsKey(userId)) {
            maxHeap.addAll(tweetsMap.get(userId));
        }

        // Add tweets from followed users to the heap
        if (followersMap.containsKey(userId)) {
            for (int followeeId : followersMap.get(userId)) {
                if (tweetsMap.containsKey(followeeId)) {
                    maxHeap.addAll(tweetsMap.get(followeeId));
                }
            }
        }

        // Get the 10 most recent tweets
        List<Integer> newsFeed = new ArrayList<>();
        int count = 0;
        while (!maxHeap.isEmpty() && count < 10) {
            newsFeed.add(maxHeap.poll().id);
            count++;
        }

        return newsFeed;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;

        followersMap.putIfAbsent(followerId, new HashSet<>());
        followersMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followersMap.containsKey(followerId)) {
            followersMap.get(followerId).remove(followeeId);
        }
    }
}