package Structural.Facade;

public class VideoConverter {
    public void convert(String filename, String format) {
        //Do some ugly things:
        //VideoFile file = new VideoFile(filename);
        // sourceCodec = new CodecFactory.extract(file)
        // if (format == "mp4")
        //     destinationCodec = new MPEG4CompressionCodec()
        // else
        //     destinationCodec = new OggCompressionCodec()
        // buffer = BitrateReader.read(filename, sourceCodec)
        // result = BitrateReader.convert(buffer, destinationCodec)
        // result = (new AudioMixer()).fix(result)
        //Finally, return
        //return new File(result)
    }
}
