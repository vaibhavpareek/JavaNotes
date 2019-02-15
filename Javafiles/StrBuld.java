class StrBuld{
static public void main(String []vp)
{
	StringBuilder sb = new StringBuilder(2);
	sb = sb.append("hi aawdc");
	System.out.println(sb.capacity());
   sb.setLength(5);
   System.out.println(sb.capacity() +" " + sb);
}

}