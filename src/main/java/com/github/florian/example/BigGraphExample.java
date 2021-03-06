package com.github.florian.example;

import com.github.florian.factory.ProcessorFactory;
import com.github.florian.generator.EvenlyGraphGenerator;
import com.github.florian.generator.MultiGraphGenerator;
import com.github.florian.generator.SparseGraphGenerator;
import com.github.florian.generator.TreeGraphGenerator;
import com.github.florian.processor.GraphProcessor;

/**
 * Created by zhidong.fzd on 17/4/12.
 */
public class BigGraphExample implements Example {
    public void draw() {
        GraphProcessor processor = ProcessorFactory.getDefaultProcessor();

        MultiGraphGenerator multiGraphGenerator = new MultiGraphGenerator();
        multiGraphGenerator.addGenerator(new EvenlyGraphGenerator(141, 4));
        multiGraphGenerator.addGenerator(new TreeGraphGenerator(3, 20, 2));
        multiGraphGenerator.addGenerator(new SparseGraphGenerator(3, 20, 2, 10));
        multiGraphGenerator.addGenerator(new EvenlyGraphGenerator(141, 20));

        processor.process(multiGraphGenerator);
    }
}
