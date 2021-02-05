/** Interface for class counter
*/
public interface CounterInterface {
/** Sets the counter with given value if the given value is non negative
* 	else print message: "This value cannot be set to count"
*	@param count
*/
  final int count = 0;
public void setCount (int count);
 /** Gets the current value of count
 *	@return the current value of count
 */
 public int getCount();
 /** Increases the count by 1
 *	 @return the increased value of count
 */

 public int increaseCount();
 /** Decreases the count by 1 if isZero() returns false
 *	 else does not decrease
 *	 @return the value of count
 */
  
 public int decreaseCount();
 /** Converts the value of count into String
 *	 @param count
 *	 @return strCount
 */
 public String toString (int count);
 /** Check if the count is zero
 *	 @param count
 *	 @return true if the count is zero
 *	 @return false if the count is not zero
 */
 public boolean isZero(int count);

}
 