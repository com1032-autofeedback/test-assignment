# Task: Student Grade Calculator

Write a Java class called `GradeCalculator` with a static method `calculateGrades`
that takes a `List<Map<String, Object>>` of students and returns a graded summary.

## Student Input Format
    {"name": "Alice", "scores": [85, 92, 78, 90, 88]}

## Requirements
1. Calculate each student's average score (rounded to 2 decimal places)
2. Assign a letter grade: A (90+), B (80+), C (70+), D (60+), F (below 60)
3. Return a list of `{"name", "average", "grade"}` maps, sorted by average descending

## Example
Input:  [{"name": "Alice", "scores": [85, 92, 78, 90, 88]},
         {"name": "Bob",   "scores": [55, 60, 58, 45, 70]}]

Output: [{"name": "Alice", "average": 86.6, "grade": "B"},
         {"name": "Bob",   "average": 57.6, "grade": "F"}]

## Notes
- Follow standard Java conventions and include Javadoc
- Handle empty score lists and missing keys gracefully
- Grade boundaries should be easy to extend in future