Figuring out Java builtins

1. 
   TreeSet and TreeMap : both implement the Collection interface; they are sorted collections using the Comparable interface; provide performance in O(log(n))
   tree map : Cannot repeat values
   	      Implements SortedMap which implements Map
	      Requires key - no duplicates
	      Can duplicate values
	      Allows null values for both keys and values
   tree set : Implented using a TreeMap instance, like hashset
   	      Implements Set
	      Does not use key
   	      
   HASHING: transforming a given entity to some number or sequence; O(1)
   hash map : a direct implementation of a Map; it maps keys to values
              can have duplicate values but must have unique keys
	      the value or key MAY be null (as opposed to in HashTable)
   hash set : an implementation of a Set; does not use keys 
   	      no duplicate elements
	      internally uses a HashMap to store its entries
   > a Set is an unordered collection
   > a Map is a collection with keyed access
   > They all have fail-fast iterators

2. speed test: hash map, tree map
   As demonstrated in the code, tree maps are slower, as they require forming a tree to order the elements.
   However, both clear at the same speeds (after all, there is no difference in their clear functions).
3. does Java have a builtin heap?
   PriorityQueue
