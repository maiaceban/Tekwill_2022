Minesweeper

Stage 1/5: Lay the groundwork
Description
Minesweeper is a game with a field in which there are a lot of mines. You need to
find where all these mines are located. To help you find the mines, there are cells that
show how many mines are located around them.
Your first step would be easy. In this step, you need to output some state of the field.
The field contains mines marked as 'X' and safe places marked as '.', but you can
choose your own symbols for marking places with mines and safe places. Note that all
the mines are in plain sight, so you don't have to hide them from the user at this stage!
Example
In the example, there are 10 mines in a 9x9 field. You can write to the output of any
other configuration of mines.
.X.......
.....X..X
....X....
......X..
..X......
....X....
..X......
..X......
......X..
Stage 2/5: Flexible mines
Description
It is not interesting when the field has exactly the same setup every time and you
know where all the mines are located, isn't it? To avoid that, let's generate a new random
configuration every time the user wants to play the game.
Let's improve the program and let the user choose how many mines she wants to
play with on the field. The user just needs to input a number from the keyboard.

The program should ask the user how many mines he wants to see on the field and
then display the field with mines. The mines must still be visible to the user, you will hide
them in the following stages. Make sure that mines are marked with the 'X' character
and safe fields are marked with the '.' character. Also, use a 9x9 field, the tests check
the field of this size.
In this stage, you need to use a random number generator. The class you need is
java.util.Random.
Examples
Example 1: How many mines do you want on the field? 10
........X
........X
......X.X
X........
.........
......X..
XX......X
.........
.....X...
Example 2: How many mines do you want on the field? 10
.........
.X.......
...X...XX
X........
.X.......
.........
.........
X......X.
...X....X
Example 3: How many mines do you want on the field? 20
.X..XX...
.....XX.X
....XX...
....XX.XX
.X......X
.....X...
..X..XX..
.........
.X.....X.

Stage 3/5: Look around you
Description
In this step, you need to calculate how many mines are around each empty cell. You
need to check 8 cells if the cell is in the middle, 5 cells if the cell is in the side, and 3
cells if the cell is in the corner. If there are from 1 to 8 mines around the cell, you need to
output the number of mines instead of the symbol representing an empty cell.
Check all the possibilities carefully.
Examples
Example 1: How many mines do you want on the field? 10
.........
.111111..
.1X22X211
.112X33X1
...12X211
....1221.
..1111X1.
123X1222.
1XX211X1.
Example 2: How many mines do you want on the field? 15
1221.....
2XX21....
X34X2..11
112X2..2X
11211..3X
1X1....2X
12321..11
12XX11232
X22211XXX
Example 3: How many mines do you want on the field? 20
.2X3X23XX
13X43X3X3
1X3X32211
2232X1...
2X2221...
X32X1..11
X32331.1X
X21XX2.22
1113X2.1X

Stage 4/5: Prepare for battle
Description
In this stage, you will create a simple game loop. After generating all the mines and
filling the field with numbers that describe their positions, you are now ready to create a
simple game loop. In this stage make it that all the numbers are already shown to the
user. The user should only find all the mines on the field.
The game should contain the following steps:
1. The game starts from the point where all the numbers are shown to the user, but
not the positions of the mines.
2. The user should enter two numbers.
3. If the user enters the coordinates of an empty cell (without a number because
cells with numbers are guaranteed to be free of mines), the program should set a
special mark on this cell which means that the user thinks a mine is located
there.
4. If the user enters the coordinates of a cell with a number, the program should ask
the user again and don't print the field.
5. If the user enters the coordinates where a special mark is located, the program
should remove the mark. This is necessary because the user can place marks
anywhere except for cells with numbers, but the game ends only if all the marks
are correct.
6. When the user marks all the mines without marking any empty cells, the game
ends.
To enter the positions of the mines, the user should see the coordinates. You should
print the coordinates grid like in the example.
Examples
Example 1
How many mines do you want on the field? 5
│123456789│
—│—————————│
1│.111.....│
2│.1.1.....│
3│.1221....│
4│..1.1....│
5│.1221....│
6│.1.21....│
7│.12.1....│
8│..1221...│
9│...1.1...│
—│—————————│

Set/delete mines marks (x and y coordinates): 2 1
There is a number here!
Set/delete mines marks (x and y coordinates): 3 2
│123456789│
—│—————————│
1│.111.....│
2│.1*1.....│
3│.1221....│
4│..1.1....│
5│.1221....│
6│.1.21....│
7│.12.1....│
8│..1221...│
9│...1.1...│
—│—————————│
Set/delete mines marks (x and y coordinates): 4 4
│123456789│
—│—————————│
1│.111.....│
2│.1*1.....│
3│.1221....│
4│..1*1....│
5│.1221....│
6│.1.21....│
7│.12.1....│
8│..1221...│
9│...1.1...│
—│—————————│
Set/delete mines marks (x and y coordinates): 3 6
│123456789│
—│—————————│
1│.111.....│
2│.1*1.....│
3│.1221....│
4│..1*1....│
5│.1221....│
6│.1*21....│
7│.12.1....│
8│..1221...│
9│...1.1...│
—│—————————│
Set/delete mines marks (x and y coordinates): 4 7

│123456789│
—│—————————│
1│.111.....│
2│.1*1.....│
3│.1221....│
4│..1*1....│
5│.1221....│
6│.1*21....│
7│.12*1....│
8│..1221...│
9│...1.1...│
—│—————————│
Set/delete mines marks (x and y coordinates): 5 9
│123456789│
—│—————————│
1│.111.....│
2│.1*1.....│
3│.1221....│
4│..1*1....│
5│.1221....│
6│.1*21....│
7│.12*1....│
8│..1221...│
9│...1*1...│
—│—————————│
Congratulations! You found all mines!
Example 2
How many mines do you want on the field? 1
│123456789│
—│—————————│
1│.........│
2│.........│
3│.........│
4│....111..│
5│....1.1..│
6│....111..│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/delete mines marks (x and y coordinates): 1 1

│123456789│
—│—————————│
1│*........│
2│.........│
3│.........│
4│....111..│
5│....1.1..│
6│....111..│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/delete mines marks (x and y coordinates): 6 5
│123456789│
—│—————————│
1│*........│
2│.........│
3│.........│
4│....111..│
5│....1*1..│
6│....111..│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/delete mines marks (x and y coordinates): 1 1
│123456789│
—│—————————│
1│.........│
2│.........│
3│.........│
4│....111..│
5│....1*1..│
6│....111..│
7│.........│
8│.........│
9│.........│
—│—————————│
Congratulations! You found all mines!

Stage 5/5: Battle!
Description
At this step, you will upgrade your program to act as a real game.
The game should use the following rules:
1. The game starts with an empty field.
2. The user can mark (flag) some cells as cells that potentially have a mine. Any
empty cell can be flagged, not just the cells that do contain a mine. In the
example, this is done by typing the word 'mine' after entering the coordinates.
After that, the cell is marked with a '*' (a mine flag).
3. The user can also remove flags from cells. In the example, the user simply types
'mine' again after entering the coordinates of the flagged cell. After that, it's
marked as an empty cell.
4. The only way to get information about the field is to check it. In the example, this
is done by typing 'free' after entering the coordinates of the cell. This means
that the user thinks that this cell is free of mines and thus can be explored. Make
the generation of mines as in the original game: the first cell checked cannot be a
mine, it should always be empty. You can achieve this in many ways, it's up to
you.
5. Obviously, if a cell has no mines around it, you can explore all the cells around it
without any problems, so this should be done automatically by the program. Also,
if there is another cell next to it with no mines around, the program should check
all the cells around that cell as well, and so on until none can be checked
automatically. In the example, all cells with no mines around are marked with a
'/'. Keep in mind that if you encounter a cell marked '*' during this process,
you must treat it as an empty cell and thus process as other cells and change it
to '/' or to a number (because if it is near a '/' cell, it obviously cannot be a
mine).
6. If the user wants to check a cell with 1 to 8 mines around it, the program should
only expose that cell, because mines could be anywhere around it.

7. If the user wants to explore a cell that contains a mine, the user loses. After that,
you can show all the mines on the field with symbol 'X'. This situation is shown
in the first example.
8. If the user marks all the cells with potential mines, the user wins. Note that the
user must mark all the mines, but no empty cells; if the user has extra flags that
do not mark mines, they continue playing. After clearing all excess mine flags, the
user wins. This situation is presented in the second example.
9. There is another way to win. The user can simply check all safe cells, leaving only
the cells with mines unexplored. After that, the user wins. This situation is
presented in the third example.
Examples
Example 1
How many mines do you want on the field? 10
│123456789│
—│—————————│
1│.........│
2│.........│
3│.........│
4│.........│
5│.........│
6│.........│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 3 2 free
│123456789│
—│—————————│
1│.1///1...│
2│.1//12...│
3│11//1....│
4│////1....│
5│11111....│
6│.........│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 1 1 free

│123456789│
—│—————————│
1│11///1...│
2│.1//12...│
3│11//1....│
4│////1....│
5│11111....│
6│.........│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 1 2 mine
│123456789│
—│—————————│
1│11///1...│
2│*1//12...│
3│11//1....│
4│////1....│
5│11111....│
6│.........│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 8 8 free
│123456789│
—│—————————│
1│11///1...│
2│*1//12...│
3│11//1....│
4│////1....│
5│11111....│
6│.........│
7│.........│
8│.......1.│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 7 8 free

│123456789│
—│—————————│
1│11///1...│
2│*1//12...│
3│11//1....│
4│////1....│
5│11111....│
6│.........│
7│.........│
8│......11.│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 6 8 free
│123456789│
—│—————————│
1│11///1...│
2│*1//12...│
3│11//1....│
4│////1....│
5│11111....│
6│.........│
7│.........│
8│.....211.│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 2 7 free
│123456789│
—│—————————│
1│11///1...│
2│*1//12...│
3│11//1....│
4│////1....│
5│11111....│
6│.........│
7│.3.......│
8│.....211.│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 5 6 free

│123456789│
—│—————————│
1│11///1X..│
2│X1//12...│
3│11//1X...│
4│////1....│
5│11111....│
6│.X..X....│
7│.3X...X..│
8│.X..X211.│
9│...X.....│
—│—————————│
You stepped on a mine and failed!
Example 2
How many mines do you want on the field? 8
│123456789│
—│—————————│
1│.........│
2│.........│
3│.........│
4│.........│
5│.........│
6│.........│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 5 5 free
│123456789│
—│—————————│
1│..1//1...│
2│111//2...│
3│/////1...│
4│/////11..│
5│//////1..│
6│/111//1..│
7│23.1//111│
8│..21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 2 1 mine

│123456789│
—│—————————│
1│.*1//1...│
2│111//2...│
3│/////1...│
4│/////11..│
5│//////1..│
6│/111//1..│
7│23.1//111│
8│..21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 3 7 mine
│123456789│
—│—————————│
1│.*1//1...│
2│111//2...│
3│/////1...│
4│/////11..│
5│//////1..│
6│/111//1..│
7│23*1//111│
8│..21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 2 8 mine
│123456789│
—│—————————│
1│.*1//1...│
2│111//2...│
3│/////1...│
4│/////11..│
5│//////1..│
6│/111//1..│
7│23*1//111│
8│.*21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 1 8 mine

│123456789│
—│—————————│
1│.*1//1...│
2│111//2...│
3│/////1...│
4│/////11..│
5│//////1..│
6│/111//1..│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 7 3 mine
│123456789│
—│—————————│
1│.*1//1...│
2│111//2...│
3│/////1*..│
4│/////11..│
5│//////1..│
6│/111//1..│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 8 3 free
│123456789│
—│—————————│
1│.*1//1...│
2│111//2...│
3│/////1*1.│
4│/////11..│
5│//////1..│
6│/111//1..│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 9 3 free

│123456789│
—│—————————│
1│.*1//1...│
2│111//2.31│
3│/////1*1/│
4│/////111/│
5│//////111│
6│/111//1..│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 8 6 mine
│123456789│
—│—————————│
1│.*1//1...│
2│111//2.31│
3│/////1*1/│
4│/////111/│
5│//////111│
6│/111//1*.│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 7 2 free
│123456789│
—│—————————│
1│.*1//1...│
2│111//2231│
3│/////1*1/│
4│/////111/│
5│//////111│
6│/111//1*.│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 7 1 mine

│123456789│
—│—————————│
1│.*1//1*..│
2│111//2231│
3│/////1*1/│
4│/////111/│
5│//////111│
6│/111//1*.│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 9 1 mine
│123456789│
—│—————————│
1│.*1//1*.*│
2│111//2231│
3│/////1*1/│
4│/////111/│
5│//////111│
6│/111//1*.│
7│23*1//111│
8│**21/////│
9│..1//////│
—│—————————│
Congratulations! You found all mines!
Example 3
How many mines do you want on the field? 5
│123456789│
—│—————————│
1│.........│
2│.........│
3│.........│
4│.........│
5│.........│
6│.........│
7│.........│
8│.........│
9│.........│
—│—————————│
Set/unset mines marks or claim a cell as free: 5 5 free

│123456789│
—│—————————│
1│/////////│
2│/////111/│
3│111//1.1/│
4│..1//1.21│
5│111//1...│
6│/////1.21│
7│/////111/│
8│111//////│
9│..1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 1 9 free
│123456789│
—│—————————│
1│/////////│
2│/////111/│
3│111//1.1/│
4│..1//1.21│
5│111//1...│
6│/////1.21│
7│/////111/│
8│111//////│
9│1.1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 1 4 free
│123456789│
—│—————————│
1│/////////│
2│/////111/│
3│111//1.1/│
4│1.1//1.21│
5│111//1...│
6│/////1.21│
7│/////111/│
8│111//////│
9│1.1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 7 4 free

│123456789│
—│—————————│
1│/////////│
2│/////111/│
3│111//1.1/│
4│1.1//1121│
5│111//1...│
6│/////1.21│
7│/////111/│
8│111//////│
9│1.1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 7 5 free
│123456789│
—│—————————│
1│/////////│
2│/////111/│
3│111//1.1/│
4│1.1//1121│
5│111//11..│
6│/////1.21│
7│/////111/│
8│111//////│
9│1.1//////│
—│—————————│
Set/unset mines marks or claim a cell as free: 8 5 free
│123456789│
—│—————————│
1│/////////│
2│/////111/│
3│111//1.1/│
4│1.1//1121│
5│111//112.│
6│/////1.21│
7│/////111/│
8│111//////│
9│1.1//////│
—│—————————│
Congratulations! You found all mines!