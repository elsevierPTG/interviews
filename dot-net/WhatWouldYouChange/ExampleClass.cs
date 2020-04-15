using System.IO;
using System.Text;

namespace ExampleProgram
{
    public class ExampleClass
    {
        public string ExampleMethod(string exampleTextFile)
        {
            StringBuilder sb = new StringBuilder();

            try
            {
                using (StreamReader r = new StreamReader(exampleTextFile))
                {
                    sb.Append(r.ReadToEnd());
                    sb.AppendLine();
                    sb.AppendLine();
                }                
            }
            catch
            {
                sb.AppendLine("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis non pulvinar sapien, nec accumsan justo. Suspendisse");
                sb.AppendLine("facilisis auctor tortor, a maximus erat feugiat eu. Lorem ipsum dolor sit amet, consectetur adipiscing elit.Proin at");
                sb.AppendLine("euismod nisi, egestas imperdiet turpis. Ut scelerisque diam sit amet tincidunt mollis.Curabitur eu quam ultricies,");
                sb.AppendLine("tincidunt augue et, lobortis diam.Suspendisse pharetra aliquet augue. Duis eu sollicitudin erat. Integer luctus");
                sb.AppendLine("euismod suscipit. In erat nulla, aliquet id consequat nec, luctus nec justo. In at gravida est, semper elementum nisi.");
                sb.AppendLine("Phasellus interdum dapibus massa, sed volutpat odio rhoncus a. Proin pellentesque quam non justo sodales eleifend.");
                sb.AppendLine("Curabitur ornare arcu id mauris porta vehicula.");
                sb.AppendLine();
                sb.AppendLine("Donec vehicula metus purus. Nulla ut augue eros. Mauris scelerisque justo nibh, non suscipit dui egestas sit amet.");
                sb.AppendLine("Vestibulum et magna pharetra, auctor eros sit amet, mollis neque. Vestibulum ultricies dolor diam, id semper sem");
                sb.AppendLine("ultricies eget. Interdum et malesuada fames ac ante ipsum primis in faucibus.Sed nec pulvinar orci. Donec sed nisl");
                sb.AppendLine("varius, mollis enim auctor, placerat sapien.Vivamus accumsan dui neque, eu tincidunt elit venenatis vel. Sed pharetra");
                sb.AppendLine("elit sed gravida convallis.");
                sb.AppendLine();
            }

            return sb.ToString();
        }
    }
}