# Interview-Question
During my last job interview, one of the questions intrigued me.  I gave a quick answer but the interviewer pointed out a logical flaw in my design.  Without the stress of an interview, I realized a few additional ways a method like this could be improved and a situation or two that were con being considered.

Proposal:  There is an array of how much Apple stock sold for yesterday.  Write a method to find where would have been the most profit to buy and sell the stocks.  Seems like a simple for loop but it can become so much more.

Error:  My mistake was I did not consider what would happen if the most a stock could sell for was before the cheapest to buy.  Yet I would propose that if you are using software like this, you probably own some shares in Apple.  So the day's trading may be better to sell first thing when stocks are high then as the stocks drop later in the day, you could perhaps buy twice as many stocks.

Version Two: Also consider the situation where a stock goes up, down and up again.  So in the morning, you buy at 5, a few hours later sell at 10, then can buy again at 7 and sell that at 9.  There are dozens of other strategies that a method like this may wish to consider.  But that perhaps should be approached from the standpoint of a larger program that has multiple methods.


So as a side project, I want to start looking at some of these possibilities and write up some methods to address all the issues that may arise.  An ideal program would read an external file that contains all the data so it could print out a final report to let the user assess perhaps multiple stocks and determine overall what the best buying strategy would have been.  Another question of course would be to keep in mind how much money the customer had and how much monetary profit that customer could have made.  All of that is beyond the initial scope.
