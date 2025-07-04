package ex3.strcmp;
publicclass Strcmp {
	// Method to compare two strings (case-sensitive)
publicboolean areStringsEqual(String s1, String s2) {
if (s1 == null || s2 == null) returnfalse;
returns1.equals(s2);
    }
// Method to compare two strings ignoring case
publicboolean areStringsEqualIgnoreCase(String s1, String s2) {
if (s1 == null || s2 == null) returnfalse;
returns1.equalsIgnoreCase(s2);
    }
// Method to check if one string contains another
publicboolean containsSubstring1(String full, String part) {
if (full == null || part == null) returnfalse;
returnfull.contains(part);
    }
	publicboolean containsSubstring(String full, String part) {
		// TODO Auto-generated method stub
		returnfalse;
	}
}
