class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        // Step 2: Use max heap (PriorityQueue) to sort by frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(b) - freqMap.get(a)
        );
        maxHeap.addAll(freqMap.keySet());

        // Step 3: Build result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int freq = freqMap.get(c);
            for (int i = 0; i < freq; i++)
                result.append(c);
        }

        return result.toString();
    }
}