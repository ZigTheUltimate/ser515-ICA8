# ser515-ICA8
A repository for JUnit testing assignment on a urinal problem. It includes the problem itself as well as the unit tests.

The Urinal Problem:
	In men's public toilets with urinals, there is this unwritten rule that you leave at least one urinal free between you and 
  the next person peeing. For example if there are 3 urinals and one person is already peeing in the left one, you will 
	choose the urinal on the right and not the one in the middle. That means that a maximum of 3 people can pee at the 
  same time on public toilets with 5 urinals when following this rule (Only 2 if the first person pees into urinal 2 or 4). 
  
The tests:
1. Test file read:
  assertEquals("Hello", urinals.inputFromFile(str));

2. Test countUrinals function:

        testCases.put("10001", 1); //returns  (10101)

        testCases.put("1001", 0); //returns  (1001)

        testCases.put("00000", 3); //returns  (10101)

        testCases.put("0000", 2); //returns  (1001)

        testCases.put("01000", 1); //returns  (01010 or 01001)
		
		assertEquals(testCase.getValue(), urinals.countUrinals(testCase.getKey()));

When tests were ran for skeletal code, the test cases failed. The following output was obtained:

1. 
	====== Anmol More == TEST TYPE ONE EXECUTED =======
	urinals.inputFromFile not implemented yet

	org.opentest4j.AssertionFailedError: 
	Expected :Hello
	Actual   :test

2. 	
	====== Anmol More == TEST TYPE TWO COUNT1 EXECUTED =======
	urinals.countUrinals not implemented yet

	org.opentest4j.AssertionFailedError: 
	Expected :1
	Actual   :-1


After implementation of urinals.inputFromFile method:
1. ====== Anmol More == TEST TYPE ONE EXECUTED =======
   ====== Anmol More == TEST TYPE ONE EXECUTED =======

2. ====== Anmol More == TEST TYPE TWO, TEST NO.: 1 EXECUTED =======
   urinals.countUrinals not implemented yet
   ====== Anmol More == TEST TYPE TWO, TEST NO.: 2 EXECUTED =======
   urinals.countUrinals not implemented yet

    org.opentest4j.AssertionFailedError:
    Expected :2
    Actual   :1

After implementation of urinals.countUrinals method:
1. ====== Anmol More == TEST TYPE ONE EXECUTED =======
   ====== Anmol More == TEST TYPE ONE EXECUTED =======

2. 
   ====== Anmol More == TEST TYPE TWO, TEST NO.: 1 EXECUTED =======
   ====== Anmol More == TEST TYPE TWO, TEST NO.: 2 EXECUTED =======

    org.opentest4j.AssertionFailedError:
    Expected :2
    Actual   :1

New test case added for test type 2:
Input: 11111
Expected Output: -1
Explanation: The input case is not possible as it violates the unwritten rule that you leave at least one urinal free between you and
the next person peeing. 

1. ====== Anmol More == TEST TYPE ONE EXECUTED =======
   ====== Anmol More == TEST TYPE ONE EXECUTED =======

2.
   ====== Anmol More == TEST TYPE TWO, TEST NO.: 1 EXECUTED =======
   01000
   ====== Anmol More == TEST TYPE TWO, TEST NO.: 2 EXECUTED =======
   0000
   ====== Anmol More == TEST TYPE TWO, TEST NO.: 3 EXECUTED =======
   1001
   ====== Anmol More == TEST TYPE TWO, TEST NO.: 4 EXECUTED =======
   11111

   org.opentest4j.AssertionFailedError:
   Expected :-1
   Actual   :0

Solved last failure by checking for consecutive 1s in input