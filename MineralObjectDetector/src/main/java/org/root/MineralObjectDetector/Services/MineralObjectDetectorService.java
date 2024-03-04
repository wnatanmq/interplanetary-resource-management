package org.root.MineralObjectDetector.Services;

import java.util.ArrayList;

import org.root.MineralObjectDetector.Models.AnalysisResult;


public class MineralObjectDetectorService<Null> {

    String REGEX_MATERIAL_INFO = "%*%";
    String REGEX_PERCENT_INFO = "&";

    public ArrayList<AnalysisResult> rawAnalysisResultToClass(
        String rawAnalysisResult
    ){
        ArrayList<AnalysisResult> listAnalysisResult = new ArrayList<AnalysisResult>();
        String[] splitedRawAnalysisResult = rawAnalysisResult.split(REGEX_MATERIAL_INFO);
        for(String elementAnalysis : splitedRawAnalysisResult){
            if (elementAnalysis.contains(REGEX_PERCENT_INFO)){
                listAnalysisResult.add(new AnalysisResult(
                    elementAnalysis.split(REGEX_PERCENT_INFO)[0],
                    Float.parseFloat(elementAnalysis.split(REGEX_PERCENT_INFO)[1])
                ));
            }
        }
        return listAnalysisResult;
    }
}
