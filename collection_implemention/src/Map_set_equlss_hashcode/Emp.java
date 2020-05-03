package Map_set_equlss_hashcode;

public class Emp
{

private	int id;
private	String name;
public Emp(int id, String name)
{
	super();
	this.id = id;
	this.name = name;
}
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode()
{
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Emp other = (Emp) obj;
	if (id != other.id)
		return false;
	if (name == null)
	{
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

}
