package ua.javarush.task.jdk13.practice.innerClass;

class Zoo
{
    private static int count = 7;
    private int mouseCount = 1;

    public static int getAnimalCount()
    {
        return count;
    }

    public int getMouseCount()
    {
        return mouseCount;
    }

    public  static class Mouse
    {
        public Mouse()
        {
        }
        public int getTotalCount()
        {
            return count;
            //+      mouseCount; //помилка компіляції
        }
        public static int getTotalCount2()
        {
            return count;
            //+ Zoo.count; //помилка компіляції
        }
    }
}
