/** Interface for class counter
*/
public interface CounterInterface {
/** Sets the counter with given interger if the interger is not negative
* 	else print message: "This value can't be set."
*	@param count
*/
public void setCount (int count);
 /** Gets the current value of count
 *	@return the current value of count
 */
 public int getCount();
 /** Increases the value of count by 1
 *	 @return the increased value of count
 */

 public int increaseCount();
 /** Decreases the count by 1 if isZero() returns false
 *	 else not decrease
 *	 @return the value of count
 */
  
 public int decreaseCount();
 /** Converts the value of count into String
 *	 @param count
 *	 @return StrCount
 */
 public String toString (int count);
 /** Check if the count is zero
 *	 @param count
 *	 @return true if the count is zero
 *	 @return false if the count is not zero
 */
 public boolean isZero(int count);

}
 