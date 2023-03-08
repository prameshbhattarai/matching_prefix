# Matching Prefixes assignment  

### Algorithm
* We are using Trie Data Structure to find the closest matching prefix for given string.

### Implementation Classes
* We have a [TrieNode](com.matching.prefix.assignment.model.TrieModel) class which is a data structure to store all the Prefix.  
* We have a [Trie](com.matching.prefix.assignment.service.Trie) service class which will insert all the prefixes in our TrieNode data structure.
  It will also provide method to search text from the Trie.
* We have a [Processor](com.matching.prefix.assignment.service.Processor) class which is a wrapper class of Trie service class.
  It will initialize all the prefixes from our `sample_prefixes.txt` into Trie.  
* Prefixes should be provided in `sample_prefixes.txt` file inside resources, which is our configuration file.
* We have a [ReaderUtils](com.matching.prefix.assignment.utils.ReaderUtils) class, which is used to read sample prefix file from resources.
* [AssignmentApplication](com.matching.prefix.assignment.AssignmentApplication) class is just a simple main class to demonstrate how we can use Processor class.
  
### Unit Test 
* We have a [ProcessorTest](com.matching.prefix.assignment.ProcessorTest) class inside test package to test the implementation.  
* For testing, we have separate `test_prefixes.txt` file inside resources in test package, which is our configuration file for our unit test.  